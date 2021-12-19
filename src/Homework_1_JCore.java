public class Homework_1_JCore {
    public static void main(String[] ags ) {
        Team team = new Team(
                "Lokomotiv",
                new Member[]{
                        new Member("Anna",300),
                        new Member("Victoria",5000),
                        new Member("Valeria", 900),
                        new Member("Jane", 700)
                }
        );
        Course course = new Course(
                "Iron wowan",
                new Let[]{
                        new Let("run",300),
                        new Let("swim",1000),
                        new Let("bike", 900),

                }
        );
        course.doIT(team);
        team.showResults();

    }

}

class Team {
    String name;
    Member[] members;

    Team(String name, Member[] members) {
        this.name = name;
        this.members = members;
    }

    public void showResults() {
        System.out.println("Team: "+this.name);
        for (int i = 0; i < this.members.length; i++) {
            System.out.println("Member: "+this.members[i].name+" Success: "+ this.members[i].success);
        }
    }

}

class Member {
    String name;
    int maxdistance;
    boolean success;

    Member (String name,int maxdistance) {
        this.name = name;
        this.maxdistance = maxdistance;
        this.success = false;
    }

}

class Course {
    String name;
    Let[] lets;
    int distance;

    Course (String name, Let[] lets) {
        this.name = name;
        this.lets = lets;
        this.distance = setDistance();
    }

    private int setDistance() {
        int distance = 0;
        for (int i = 0; i < this.lets.length; i++) {
            distance += this.lets[i].distance;
        }
        return distance;
    }

    public void doIT (Team team) {
        for (int i = 0; i < team.members.length; i++) {
            if (team.members[i].maxdistance >= this.distance) {
                team.members[i].success = true;
            }
        }
    }
}

class Let {
    String name;
    int distance;

    Let (String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

}
