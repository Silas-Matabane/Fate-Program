public class Main {
    public static void main(String[] args) {
        int fate = (int)(Math.random() * 34);
        System.out.println("Case: " + fate);
        switch (fate) {
            case 0:
                System.out.println("Introduction to C# -- SoloLearn -- 1 Hours");
                break;
            case 1:
                System.out.println("Time for music, But specifically focus on");
                int musicField = (int) (Math.random() * 9);
                System.out.println("Case field: " + musicField);
                switch (musicField) {
                    case 0 -> System.out.println("Acoustic Guitar - 2 HOURS");
                    case 1 -> System.out.println("Nylon Guitar - 2 HOURS");
                    case 2 -> System.out.println("Cubase - Learn Cubase -- 2 Hours");
                    case 3 -> System.out.println("Fl Studio - learn How to record - 2 HOURS");
                    case 4 -> System.out.println("Learn chords - electric -- 2 Hours");
                    case 5 -> System.out.println("Learn new electric licks -- 2 Hours");
                    case 6 -> System.out.println("Learn How to play a new Song - Cover wise -- 2 Hours");
                    case 7 -> System.out.println("Research About -- Boss GT-8 -- Manual -- 2 HOURS");
                    case 8 -> System.out.println("Learn Bass guitar -- Your bass checks. -- 2 hours");
                    default -> System.out.println("Something is wrong");
                }
                break;
            case 2:
                System.out.println("Ethical Hacking -- 2 Hours\nNext Session Complete Section 4 & 5");
                break;
            case 3:
                System.out.println("Database TextBook Tinny College Project -- 30 Minutes");
                break;
            case 4:
                System.out.println("Computer Networks -- Textbook -- 2 Hours");
                break;
            case 5:
                System.out.println("Time for java, But specifically focus on");
                int javaField = (int)(Math.random() * 5.0);
                System.out.println("Case field: " + javaField);
                switch (javaField) {
                    case 0:
                        System.out.println("Spring - Research  -- 2 Hour");
                        break;
                    case 1:
                        System.out.println("Spring - Udemy Tutorial -- 2 Hours");
                        break;
                    case 2:
                        System.out.println("Maven -  Research -- 2 Hour");
                        break;
                    case 3:
                        System.out.println("Java Textbook -- 2 Hour");
                        break;
                    case 4:
                        System.out.println("Java SoloLearn -- 2 Hour");
                        break;
                    case 5:
                        System.out.println("Java W3Schools -- 2 Hour");
                        break;
                    default:
                        System.out.println("Something is wrong");
                        break;
                }
                break;
            case 6:
                System.out.println("System Design Textbook - 1 Hour for now");
                break;
            case 7:
                System.out.println("Continue FreeCodeCamp -- 2 Hours");
                break;
            case 8:
                System.out.println("Organize your screenshot pics -- 1 Hour");
                break;
            case 9:
                System.out.println("Organize your music library -- 1 Hour");
                break;
            case 10:
                System.out.println("ASP.NET documentation -- 2 Hours");
                break;
            case 11:
                System.out.println("100 days - Python Project -- Complete A day");
                break;
            case 12:
                System.out.println("RESTful Web API - The Complete Guide (.NET7 API) Part 1 -- 2 Hours");
                break;
            case 13:
                System.out.println("Try to solve 1 leet code problem -- 30 minutes");
                break;
            case 14:
                System.out.println("MySQL Udemy Project -- 3 Hours");
                break;
            case 15:
                System.out.println("MongoDB -- 2 Hours");
                break;
            case 16:
                System.out.println("Portfolio -- 2 HOURS");
                break;
            case 17:
                System.out.println("The Complete 2024 Web Development Bootcamp -- 2 Hours");
                break;
            case 18:
                System.out.println(".NET Core MVC - The Complete Guide 2024 [E-commerce app] -- 2 Hours");
                break;
            case 19:
                System.out.println(".The Complete JavaScript Course 2024: From Zero to Expert! -- Complete a section ");
                break;
            case 20:
                System.out.println("Time for Internship related at Konecta");
                int task = (int)(Math.random() * 4.0);
                System.out.println("Case field: " + task);
                switch (task) {
                    case 0:
                        System.out.println("HSNM Hotspot  -- 2 Hour");
                        break;
                    case 1:
                        System.out.println("WordPress -- 3 Hours");
                        break;
                    case 2:
                        System.out.println("Microsoft Learn  -- 2 Hour");
                        break;
                    case 3:
                        System.out.println("Portfolio of Evidence -- 2 Hour");
                        break;
                    default:
                        System.out.println("Something is wrong");
                        break;
                }
                break;
            case 21:
                System.out.println("Play a game to refresh");
                int gameOption =  (int)(Math.random() * 3.0);
                System.out.println("Which game: " + gameOption);
                switch (gameOption) {
                    case 0:
                        System.out.println("Tekken  -- 30 minutes");
                        break;
                    case 1:
                        System.out.println("Fifa -- 30 minutes");
                        break;
                    case 2:
                        System.out.println("Need for Speed  -- 30 minutes");
                        break;
                    default:
                        System.out.println("Something is your game code");
                        break;
                }
                break;
            case 22:
                System.out.println("Solo learn - Python for Beginners -- 2 HOURS");
                break;
            case 23:
                System.out.println("Organize your Programming books & Docs folder -- 1 hour");
                break;
            case 24:
                System.out.println("Find out to push a project from inteliJ to GitHub. -- 1 hour 30 minutes");
                break;
            case 25:
                System.out.println("Update CV. -- 30 minutes");
                break;
            case 26:
                System.out.println("Find a Youtube course tutorial to learn front-end -- 2 hours");
                int lessonOption =  (int)(Math.random() * 6.0);
                System.out.println("Your tutorial is  " + lessonOption);
                switch (lessonOption) {
                    case 0:
                        System.out.println("CSS");
                        break;
                    case 1:
                        System.out.println("Bootstrap");
                        break;
                    case 2:
                        System.out.println("Sass");
                        break;
                    case 3:
                        System.out.println("Tailwind CSS");
                        break;
                    case 4:
                        System.out.println("HTML wireframes and templates");
                        break;
                    case 5:
                        System.out.println("WordPress");
                        break;
                    default:
                        System.out.println("Something is your game code");
                        break;
                }
            case 27:
                System.out.println("Organize your bookmarks and sync them across browsers -- 30 minutes");
                break;
            case 28:
                System.out.println("Web Development Sololearn -- 1 hour");
                break;
            case 29:
                System.out.println("Research How to add an image to Github readme File -- 1 hour");
                break;

            case 30:
                System.out.println("Organize your Personal OneDrive Documents -- 30 minutes");
                break;
            case 31:
                System.out.println("Time for Forex Trading, But specifically focus on");
                int forextask = (int) (Math.random() * 1);
                System.out.println("Case field: " + forextask);
                switch (forextask) {
                    case 0 -> System.out.println("Manage & Organize your accounts");
                    default -> System.out.println("Something is wrong");
                }
                break;
            case 32:
                System.out.println("Time for GitHub, But specifically focus on");
                int gitHubTask = (int) (Math.random() * 2);
                System.out.println("Case field: " + gitHubTask);
                switch (gitHubTask) {
                    case 0 -> System.out.println("Restart Microsoft Learn GitHub lesson - 1 Hour ");
                    case 1 -> System.out.println("Start the W3Schools GitHub lesson - 1 Hour ");
                    default -> System.out.println("Something is wrong");
                }
                break;
            case 33:
                System.out.println("Take a tutorial on how to use Copilot -- 1 hour 30 minutes.");
                break;

            default:
                System.out.println("Error Somewhere");
        }
    }
}
