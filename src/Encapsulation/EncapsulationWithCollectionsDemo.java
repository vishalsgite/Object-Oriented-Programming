package Encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Hiding and controlling access to collections.
class Team {
    private List<String> members = new ArrayList<>();

    // Getter provides read-only access
    public List<String> getMembers() {
        return Collections.unmodifiableList(members);
    }

    // Method to add members
    public void addMember(String member) {
        members.add(member);
        System.out.println("Added member: " + member);
    }
}

public class EncapsulationWithCollectionsDemo {
    public static void main(String[] args) {
        Team team = new Team();
        team.addMember("Alice");
        team.addMember("Bob");

        System.out.println("Team Members: " + team.getMembers());

        // Attempting to modify the returned list will throw an exception
        // team.getMembers().add("Charlie"); // Uncommenting this line will cause an error
    }
}
