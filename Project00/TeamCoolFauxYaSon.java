package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.SchaperMember;


public class TeamCool extends Team
{
    public TeamCool(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new SchaperMember("Greg Schaper"));
        members.add(new SchaperMember("Greg Schaper"));
        members.add(new SchaperMember("Greg Schaper"));
	members.add(new FauxMember("Tim Faux"));
	members.add(new AndersonMember("Ben Anderson"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
