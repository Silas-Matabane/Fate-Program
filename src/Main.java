import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static List<Integer> taskList = new ArrayList<>();
    private static Set<Integer> pickedTasks = new HashSet<>();
    private static final String TASK_FILE = "picked_tasks.txt";

    public static void main(String[] args) {
        loadPickedTasks();
        initializeTaskList();
        pickNextTask();
        savePickedTasks();
    }

    private static void initializeTaskList() {
        for (int i = 0; i < 36; i++) {
            if (!pickedTasks.contains(i)) {
                taskList.add(i);
            }
        }
        Collections.shuffle(taskList);
    }

    private static void pickNextTask() {
        if (taskList.isEmpty()) {
            System.out.println("All tasks have been picked. Resetting the task list.");
            pickedTasks.clear();
            initializeTaskList();
        }
        int fate = taskList.remove(0);
        pickedTasks.add(fate);
        System.out.println("Case: " + fate);
        handleFate(fate);
    }

    private static void handleFate(int fate) {
        switch (fate) {
            case 0 -> System.out.println("Introduction to C# -- SoloLearn -- 1 Hours");
            case 1 -> handleMusic();
            case 2 -> System.out.println("Ethical Hacking\n\tNext Session Complete Section 4 & 5");
            case 3 -> System.out.println("Database TextBook Tinny College Project -- 30 Minutes");
            case 4 -> System.out.println("Computer Networks -- Textbook -- 2 Hours");
            case 5 -> handleJava();
            case 6 -> System.out.println("System Design Textbook - 1 Hour for now");
            case 7 -> System.out.println("Continue FreeCodeCamp -- 2 Hours");
            case 8 -> System.out.println("Organize your screenshot pics -- 1 Hour");
            case 9 -> System.out.println("Organize your music library -- 1 Hour");
            case 10 -> System.out.println("ASP.NET documentation -- 2 Hours");
            case 11 -> System.out.println("100 days - Python Project -- Complete A day");
            case 12 -> System.out.println("RESTful Web API - The Complete Guide (.NET7 API) Part 1 -- Complete a section");
            case 13 -> System.out.println("Try to solve 1 leet code problem -- 30 minutes");
            case 14 -> System.out.println("MySQL Udemy Project -- Complete a session");
            case 15 -> System.out.println("MongoDB -- 2 Hours");
            case 16 -> System.out.println("Portfolio -- 1 Hour 30 Minutes\n\tLast time you were working on the Canva Design using chatGPT - Continue from there");
            case 17 -> System.out.println("The Complete 2024 Web Development Bootcamp -- 2 Hours");
            case 18 -> System.out.println(".NET Core MVC - The Complete Guide 2024 [E-commerce app] -- 2 Hours\n\tComplete section 2.");
            case 19 -> System.out.println("The Complete JavaScript Course 2024: From Zero to Expert! -- Complete a section");
            case 20 -> handleInternship();
            case 21 -> handleGame();
            case 22 -> System.out.println("Solo learn - Python for Beginners -- 2 HOURS");
            case 23 -> System.out.println("Manage your YouTube playlists and channel subscription -- 45 minutes.");
            case 24 -> System.out.println("Find out to push a project from inteliJ to GitHub. -- 1 hour 30 minutes");
            case 25 -> System.out.println("Update CV. -- 30 minutes");
            case 26 -> handleFrontEnd();
            case 27 -> System.out.println("Organize your bookmarks and sync them across browsers -- 30 minutes");
            case 28 -> System.out.println("Web Development Sololearn -- 1 hour");
            case 29 -> System.out.println("Research How to add an image to Github readme File -- 1 hour");
            case 30 -> System.out.println("Organize your Personal OneDrive Documents -- 30 minutes");
            case 31 -> handleForex();
            case 32 -> handleGitHub();
            case 33 -> System.out.println("Explore the bookmarks you have saved -- 45 minutes.");
            case 34 -> System.out.println("Manage Web browser Bookmarks -- 45 minutes.");
            case 35 -> System.out.println("Exercise -- 15 minutes.");


            default -> System.out.println("Error Somewhere");
        }
    }

    private static void handleMusic() {
        System.out.println("Time for Music");
        int task = (int) (Math.random() * 3.0);
        System.out.println("Case field: " + task);
        switch (task) {
            case 0 -> System.out.println("Practice Guitar -- 1 Hour");
            case 1 -> System.out.println("Learn a new song -- 1 Hour");
            case 2 -> System.out.println("Compose a new piece -- 1 Hour");
            default -> System.out.println("Something is wrong");
        }
    }

    private static void handleJava() {
        System.out.println("Time for Java");
        int task = (int) (Math.random() * 3.0);
        System.out.println("Case field: " + task);
        switch (task) {
            case 0 -> System.out.println("Complete a Java tutorial -- 1 Hour");
            case 1 -> System.out.println("Work on a Java project -- 1 Hour");
            case 2 -> System.out.println("Review Java concepts -- 1 Hour");
            default -> System.out.println("Something is wrong");
        }
    }

    private static void handleInternship() {
        System.out.println("Time for Internship related at Konecta");
        int task = (int) (Math.random() * 4.0);
        System.out.println("Case field: " + task);
        switch (task) {
            case 0 -> System.out.println("HSNM Hotspot  -- 2 Hour");
            case 1 -> System.out.println("WordPress -- 3 Hours");
            case 2 -> System.out.println("Microsoft Learn  -- 2 Hour");
            case 3 -> System.out.println("Portfolio of Evidence -- 2 Hour");
            default -> System.out.println("Something is wrong");
        }
    }

    private static void handleGame() {
        System.out.println("Play a game to refresh");
        int gameOption = (int) (Math.random() * 3.0);
        System.out.println("Which game: " + gameOption);
        switch (gameOption) {
            case 0 -> System.out.println("Tekken  -- 30 minutes");
            case 1 -> System.out.println("Fifa -- 30 minutes");
            case 2 -> System.out.println("Need for Speed  -- 30 minutes");
            default -> System.out.println("Something is your game code");
        }
    }

    private static void handleFrontEnd() {
        System.out.println("Find a Youtube course tutorial to learn front-end");
        int lessonOption = (int) (Math.random() * 7);
        System.out.println("Your tutorial is option:  " + lessonOption + "\nOn the previous session the conclusion was that the I have to really lean html and css\n\tLearn: ");
        switch (lessonOption) {
            case 0 -> System.out.println("CSS");
            case 1 -> System.out.println("Bootstrap");
            case 2 -> System.out.println("Sass");
            case 3 -> System.out.println("Tailwind CSS");
            case 4 -> System.out.println("HTML wireframes and templates -- 1 hour");
            case 5 -> System.out.println("WordPress");
            case 6 -> System.out.println("Remember to buy the Sass Course");
            default -> System.out.println("Something is your game code");
        }
    }

    private static void handleForex() {
        System.out.println("Time for Forex Trading, But specifically focus on");
        int forextask = (int) (Math.random() * 1);
        System.out.println("Case field: " + forextask);
        if (forextask == 0) {
            System.out.println("Manage & Organize your accounts -- 30 minutes");
        } else {
            System.out.println("Something is wrong");
        }
    }

    private static void handleGitHub() {
        System.out.println("Time for GitHub, But specifically focus on");
        int gitHubTask = (int) (Math.random() * 2);
        System.out.println("Case field: " + gitHubTask);
        switch (gitHubTask) {
            case 0 -> System.out.println("Restart Microsoft Learn GitHub lesson - 1 Hour ");
            case 1 -> System.out.println("Start the W3Schools GitHub lesson - 1 Hour ");
            default -> System.out.println("Something is wrong");
        }
    }

    private static void savePickedTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TASK_FILE))) {
            for (int task : pickedTasks) {
                writer.write(task + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadPickedTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TASK_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                pickedTasks.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            // If the file does not exist or cannot be read, initialize with default values
            pickedTasks = new HashSet<>();
        }
    }
}