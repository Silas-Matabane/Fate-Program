import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String filePath = "picked_tasks.txt";
        Set<Integer> pickedTasks = new HashSet<>();

        // Read picked tasks from file
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                pickedTasks.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("Error reading picked tasks file: " + e.getMessage());
        }

        // Check if all tasks have been picked
        if (pickedTasks.size() >= 52) {
            System.out.println("All tasks have been picked. Please update the program.");
            return;
        }

        // Generate a new task that hasn't been picked yet
        int task;
        do {
            task = (int) (Math.random() * 51);
        } while (pickedTasks.contains(task));

        // Add the new task to the picked tasks file
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath), StandardOpenOption.APPEND)) {
            writer.write(task + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to picked tasks file: " + e.getMessage());
        }

        // Print the task
        switch (task) {
            case 0 -> System.out.println("Case: 0\nTask Name: Introduction to C# -- SoloLearn -- 1 Hours");
            case 1 -> System.out.println("Case: 1\nTask Name: Ethical Hacking\n\tNext Session Complete Section 6 & 7");
            case 2 -> System.out.println("Case: 2\nTask Name: Compose a new piece -- 1 Hour");
            case 3 -> System.out.println("Case: 3\nTask Name: Database TextBook Tinny College Project -- 30 Minutes");
            case 4 -> System.out.println("Case: 4\nTask Name: Computer Networks -- Textbook -- 2 Hours");
            case 5 -> System.out.println("Case: 5\nTask Name: WordPress");
            case 6 -> System.out.println("Case: 6\nTask Name: Organize your paper notes  -- 60 minutes");
            case 7 -> System.out.println("Case: 7\nTask Name: Continue FreeCodeCamp -- 2 Hours");
            case 8 -> System.out.println("Case: 8\nTask Name: Organize your screenshot pics -- 1 Hour");
            case 9 -> System.out.println("Case: 9\nTask Name: Organize your music library -- 1 Hour");
            case 10 -> System.out.println("Case: 10\nTask Name: ASP.NET documentation -- 2 Hours");
            case 11 -> System.out.println("Case: 11\nTask Name: 100 days - Python Project -- Complete A day");
            case 12 -> System.out.println("Case: 12\nTask Name: RESTful Web API - The Complete Guide (.NET7 API) Part 1 -- Complete a section - next : 3");
            case 14 -> System.out.println("Case: 14\nTask Name: MySQL Udemy Project -- Complete a session");
            case 15 -> System.out.println("Case: 15\nTask Name: MongoDB -- 2 Hours");
            case 16 -> System.out.println("Case: 16\nTask Name: Portfolio -- 1 Hour 30 Minutes\n\tLast time you were working on the Canva Design using chatGPT - Continue from there");
            case 17 -> System.out.println("Case: 17\nTask Name: The Complete 2024 Web Development Bootcamp -- 2 Hours");
            case 18 -> System.out.println("Case: 18\nTask Name: .NET Core MVC - The Complete Guide 2024 [E-commerce app] -- 2 Hours\n\tComplete section 2.");
            case 19 -> System.out.println("Case: 19\nTask Name: The Complete JavaScript Course 2024: From Zero to Expert! -- Complete a section");
            case 20 -> System.out.println("Case: 20\nTask Name: Complete a Java tutorial -- 1 Hour");
            case 21 -> System.out.println("Case: 21\nTask Name: Work on a Java project -- 1 Hour");
            case 22 -> System.out.println("Case: 22\nTask Name: Solo learn - Python for Beginners -- 2 HOURS");
            case 23 -> System.out.println("Case: 23\nTask Name: Manage your YouTube playlists and channel subscription -- 45 minutes.");
            case 24 -> System.out.println("Case: 24\nTask Name: Find out how the mouse works   -- 60 minutes");
            case 25 -> System.out.println("Case: 25\nTask Name: Learn your saved vocabulary words -- 30 minutes.");
            case 26 -> System.out.println("Case: 26\nTask Name: Review Java concepts -- 1 Hour");
            case 27 -> System.out.println("Case: 27\nTask Name: Import your Edge bookmarks to Chrome -- 15 minutes");
            case 28 -> System.out.println("Case: 28\nTask Name: Web Development Sololearn -- 1 hour");
            case 29 -> System.out.println("Case: 29\nTask Name: Research How to add an image to Github readme File -- 1 hour");
            case 30 -> System.out.println("Case: 30\nTask Name: Organize your Personal OneDrive Documents -- 30 minutes");
            case 31 -> System.out.println("Case: 31\nTask Name: WordPress -- 3 Hours");
            case 32 -> System.out.println("Case: 32\nTask Name: Microsoft Learn  -- 2 Hour");
            case 33 -> System.out.println("Case: 33\nTask Name: Explore the bookmarks you have saved -- 45 minutes.");
            case 34 -> System.out.println("Case: 34\nTask Name: Manage Web browser Bookmarks -- 45 minutes.");
            case 35 -> System.out.println("Case: 35\nTask Name: Exercise -- 15 minutes.");
            case 36 -> System.out.println("Case: 36\nTask Name: Manage your Social media pages  -- 60 minutes");
            case 37 -> System.out.println("Case: 37\nTask Name: Organize your linkedIn skills on your certificates  -- 60 minutes");
            case 38 -> System.out.println("Case: 38\nTask Name: Practice Guitar -- 1 Hour");
            case 39 -> System.out.println("Case: 39\nTask Name: Learn a new song -- 1 Hour");
            case 40 -> System.out.println("Case: 40\nTask Name: HSNM Hotspot  -- 2 Hour");
            // case 41 -> System.out.println("Case: 41\nTask Name: Portfolio of Evidence -- 2 Hour");
            case 42 -> System.out.println("Case: 42\nTask Name: Tekken  -- 30 minutes");
            case 43 -> System.out.println("Case: 43\nTask Name: Fifa -- 30 minutes");
            case 44 -> System.out.println("Case: 44\nTask Name: Need for Speed  -- 30 minutes");
            case 45 -> System.out.println("Case: 45\nTask Name: CSS");
            case 46 -> System.out.println("Case: 46\nTask Name: Bootstrap");
            case 47 -> System.out.println("Case: 47\nTask Name: Sass");
            case 48 -> System.out.println("Case: 48\nTask Name: Start the W3Schools GitHub lesson - 1 Hour ");
            case 49 -> System.out.println("Case: 49\nTask Name: HTML wireframes and templates -- 1 hour");
            case 50 -> System.out.println("Case: 50\nTask Name: Restart Microsoft Learn GitHub lesson - 1 Hour ");

            default -> System.out.println("Error: Task ID out of range");
        }
    }
}