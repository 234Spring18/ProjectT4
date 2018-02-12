package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.FauxMember;
import Project00.AndersonMember;
import Project00.McCoolMember;


public class TeamCoolFauxYaSon extends Team
{
    public TeamCoolFauxYaSon(String name)
    {
        super(name);
        createTeamMembers();
    }
    
    public void createTeamMembers()
    {
        members.add(new FauxMember("Tim Faux"));
        members.add(new AndersonMember("Ben Anderson"));
        members.add(new McCoolMember("Caelin Finn McCool"));
        // create a new member class for each team member
	members.add(new NischalMember("Nischal Piya"));
        // and add it to the team members list
    }
}
