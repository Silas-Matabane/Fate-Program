import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Print the task
        Random random = new Random();
        int luckyNumber = random.nextInt(54);
        System.out.println("Complete the following Task:\n");
        switch (luckyNumber) {
            case 0 -> System.out.println("\tTask Number: 0\n\tTask Name: Introduction to C# -- SoloLearn -- 1 Hours");
            case 1 -> System.out.println("\tTask Number: 1\n\tTask Name: Ethical Hacking\n\tNext Session Complete Section 6 & 7");
            case 2 -> System.out.println("\tTask Number: 2\n\tTask Name: Compose a new piece -- 1 Hour");
            case 3 -> System.out.println("\tTask Number: 3\n\tTask Name: Database TextBook Tinny College Project -- 30 Minutes");
            case 4 -> System.out.println("\tTask Number: 4\n\tTask Name: Computer Networks -- Textbook -- 2 Hours");
            case 5 -> System.out.println("\tTask Number: 5\n\tTask Name: WordPress");
            case 6 -> System.out.println("\tTask Number: 6\n\tTask Name: Organize your paper notes  -- 60 minutes");
            case 7 -> System.out.println("\tTask Number: 7\n\tTask Name: Continue FreeCodeCamp -- 2 Hours");
            case 8 -> System.out.println("\tTask Number: 8\n\tTask Name: Organize your screenshot pics -- 1 Hour");
            case 9 -> System.out.println("\tTask Number: 9\n\tTask Name: Organize your music library -- 1 Hour");
            case 10 -> System.out.println("\tTask Number: 10\n\tTask Name: ASP.NET documentation -- 2 Hours");
            case 11 -> System.out.println("\tTask Number: 11\n\tTask Name: 100 days - Python Project -- Complete A day");
            case 12 -> System.out.println("\tTask Number: 12\n\tTask Name: RESTful Web API - The Complete Guide (.NET7 API) Part 1 -- Complete a section - next : 3");
            case 13 -> System.out.println("\tTask Number: 13\n\t\tTask Name: Try to solve 1 leet code problem -- 30 minutes");
            case 14 -> System.out.println("\tTask Number: 14\n\t\tTask Name: MySQL Udemy Project -- Complete a session");
            case 15 -> System.out.println("\tTask Number: 15\n\t\tTask Name: MongoDB -- 2 Hours");
            case 16 -> System.out.println("\tTask Number: 16\n\t\tTask Name: Portfolio -- 1 Hour 30 Minutes\n\tLast time you were working on the Canva Design using chatGPT - Continue from there");
            case 17 -> System.out.println("\tTask Number: 17\n\t\tTask Name: The Complete 2024 Web Development Bootcamp -- 2 Hours");
            case 18 -> System.out.println("\tTask Number: 18\n\t\tTask Name: .NET Core MVC - The Complete Guide 2024 [E-commerce app] -- 2 Hours\n\tComplete section 2.");
            case 19 -> System.out.println("\tTask Number 19\n\t\tTask Name: The Complete JavaScript Course 2024: From Zero to Expert! -- Complete a section");
            case 20 -> System.out.println("\tTask Number 20\n\t\tTask Name: Complete a Java tutorial -- 1 Hour");
            case 21 -> System.out.println("\tTask Number 21\n\t\tTask Name: Work on a Java project -- 1 Hour");
            case 22 -> System.out.println("\tTask Number 22\n\t\tTask Name: Solo learn - Python for Beginners -- 2 HOURS");
            case 23 -> System.out.println("\tTask Number 23\n\t\tTask Name: Manage your YouTube playlists and channel subscription -- 45 minutes.");
            case 24 -> System.out.println("\tTask Number 24\n\t\tTask Name: Find out how the mouse works   -- 60 minutes");
            case 25 -> System.out.println("\tTask Number 25\n\t\tTask Name: Learn your saved vocabulary words -- 30 minutes.");
            case 26 -> System.out.println("\tTask Number 26\n\t\tTask Name: Review Java concepts -- 1 Hour");
            case 27 -> System.out.println("\tTask Number 27\n\t\tTask Name: Import your Edge bookmarks to Chrome -- 15 minutes");
            case 28 -> System.out.println("\tTask Number 28\n\t\tTask Name: Web Development Sololearn -- 1 hour");
            case 29 -> System.out.println("\tTask Number 29\n\t\tTask Name: Research How to add an image to Github readme File -- 1 hour");
            case 30 -> System.out.println("\tTask Number 30\n\t\tTask Name: Organize your Personal OneDrive Documents -- 30 minutes");
            case 31 -> System.out.println("\tTask Number 31\n\t\tTask Name: WordPress -- 3 Hours");
            case 32 -> System.out.println("\tTask Number 32\n\t\tTask Name: Microsoft Learn  -- 2 Hour");
            case 33 -> System.out.println("\tTask Number 33\n\t\tTask Name: Explore the bookmarks you have saved -- 45 minutes.");
            case 34 -> System.out.println("\tTask Number 34\n\t\tTask Name: Manage Web browser Bookmarks -- 45 minutes.");
            case 35 -> System.out.println("\tTask Number 35\n\t\tTask Name: Exercise -- 15 minutes.");
            case 36 -> System.out.println("\tTask Number 36\n\t\tTask Name: Manage your Social media pages  -- 60 minutes");
            case 37 -> System.out.println("\tTask Number 37\n\t\tTask Name: Organize your linkedIn skills on your certificates  -- 60 minutes");
            case 38 -> System.out.println("\tTask Number 38\n\t\tTask Name: Practice Guitar -- 1 Hour");
            case 39 -> System.out.println("\tTask Number 39\n\t\tTask Name: Learn a new song -- 1 Hour");
            case 40 -> System.out.println("\tTask Number 40\n\t\tTask Name: HSNM Hotspot  -- 2 Hour");
            case 41 -> System.out.println("\tTask Number 41\n\t\tTask Name: Portfolio of Evidence -- 2 Hour");
            case 42 -> System.out.println("\tTask Number 42\n\t\tTask Name: Tekken  -- 30 minutes");
            case 43 -> System.out.println("\tTask Number 43\n\t\tTask Name: Fifa -- 30 minutes");
            case 44 -> System.out.println("\tTask Number 44\n\t\tTask Name: Need for Speed  -- 30 minutes");
            case 45 -> System.out.println("\tTask Number 45\n\t\tTask Name: CSS");
            case 46 -> System.out.println("\tTask Number 46\n\t\tTask Name: Bootstrap");
            case 47 -> System.out.println("\tTask Number 47\n\t\tTask Name: Sass");
            case 48 -> System.out.println("\tTask Number 48\n\t\tTask Name: Tailwind CSS");
            case 49 -> System.out.println("\tTask Number 49\n\t\tTask Name: HTML wireframes and templates -- 1 hour");
            case 50 -> System.out.println("\tTask Number 50\n\t\tTask Name: Restart Microsoft Learn GitHub lesson - 1 Hour ");
            case 51 -> System.out.println("\tTask Number 51\n\t\tTask Name: Start the W3Schools GitHub lesson - 1 Hour ");
            case 52 -> System.out.println("\tTask Number 52\n\t\tTask Name: Find out How to convert Speadsheet to PDF");
            case 53 -> System.out.println("\tTask Number 53\n\t\tTask Name: Organize your CV's and Delete Unnecessary ones -- 30 minutes");
            default -> System.out.println("\t\t\tError: Make your program more dynamic by adding more cases");
        }
        System.out.print("\n\nDo you want to enter the duration of the task? (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(Objects.equals(input, "Y") || Objects.equals(input, "y") || Objects.equals(input, "yes") || Objects.equals(input, "Yes")) {
            System.out.println("\t\tTask Duration: "+convertToMinutes()+ " minutes.");
            System.out.println("\t\tEnjoy your Work.");
        }
        else{
            System.out.println("\t\tEnjoy your Work.");
        }

    }
    public static int convertToMinutes() {
        System.out.print("\nHow many hours do you want to spend on this task?\n\tEnter the number of hours: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = hours * 60;
        return minutes;
    }

}


