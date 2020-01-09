import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input;
        while (!"course start".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] command = input.split(":");
            String type = command[0];
            String lessonTitle = command[1];
            switch (type) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!schedule.contains(lessonTitle)) {
                        if (index >= 0 && index < schedule.size()) {
                            schedule.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    schedule.remove(lessonTitle);
                    break;
                case "Swap":
                    String swapLessonWith = command[2];
                    swapping(schedule, lessonTitle, swapLessonWith);
                    break;
                case "Exercise":
                    int indexOfLesson = schedule.indexOf(lessonTitle);
                    if (schedule.contains(lessonTitle)) {

                        if (indexOfLesson == schedule.size() - 1) {
                            schedule.add(lessonTitle + "-Exercise");
                        } else {
                            if (!schedule.get(indexOfLesson + 1).equals(lessonTitle + "-Exercise")) {
                                schedule.add(indexOfLesson + 1, lessonTitle + "-Exercise");
                            }
                        }
                    } else {
                        schedule.add(lessonTitle);
                        schedule.add(lessonTitle + "-Exercise");
                    }
                    break;
                default:
                    break;
            }
        }
        for (int i = 1; i <= schedule.size(); i++) {
            System.out.println(i + "." + schedule.get(i - 1));
        }
    }

    private static void swapping(List<String> schedule, String lessonTitle, String swapLessonWith) {
        if (schedule.contains(lessonTitle) && schedule.contains(swapLessonWith)) {
            int lessonTitleIndex = schedule.indexOf(lessonTitle);
            int swapIndex = schedule.indexOf(swapLessonWith);
            schedule.add(swapIndex, lessonTitle);
            schedule.remove(swapLessonWith);
            schedule.remove(lessonTitleIndex);
            schedule.add(lessonTitleIndex, swapLessonWith);
            if (schedule.contains(lessonTitle + "-Exercise")) {
                if (swapIndex == schedule.size() - 1) {
                    schedule.add(lessonTitle + "-Exercise");
                } else {
                    schedule.add(swapIndex + 1, lessonTitle + "-Exercise");
                }
                schedule.remove(lessonTitleIndex + 2);
            } else if (schedule.contains(swapLessonWith + "-Exercise")) {
                if (lessonTitleIndex == schedule.size() - 1) {
                    schedule.add(swapLessonWith + "-Exercise");
                } else {
                    schedule.add(lessonTitleIndex + 1, swapLessonWith + "-Exercise");
                }
                schedule.remove(swapIndex + 2);
            }
        }
    }
}
