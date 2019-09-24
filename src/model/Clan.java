package model;
//import java.util.*;

public class Clan {

	private String name;
	private Personage firstPersonage;

	public Clan(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Personage getFirstPersonage() {
		return firstPersonage;
	}

	public void setFirstPersonage(Personage firstPersonage) {
		this.firstPersonage = firstPersonage;
	}

	public int compareByName(Clan p) {
		return name.compareTo(p.getName());
	}

	// By bubble
	public void sortPersonageByScore() {

		if (firstPersonage != null) {
			Personage ne = firstPersonage;
			Personage nex = firstPersonage.getNext();
			while (nex != null) {

				if (ne.compare(ne, nex) > 0) {

					Personage temp = new Personage(ne.getName(), ne.getPersonality(), ne.getDate(), ne.getPower());
					ne.setName(nex.getName());
					ne.setPersonality(nex.getPersonality());
					ne.setDate(nex.getDate());
					ne.setPower(nex.getPower());
					nex.setName(temp.getName());
					nex.setPersonality(temp.getPersonality());
					nex.setDate(temp.getDate());
					nex.setPower(temp.getPower());

				} else {
					if (nex.getNext() != null) {
						ne = ne.getNext();
						nex = nex.getNext();
					}else {
						nex=null;
					}
				}

			}
		}
	}

	@Override
	public String toString() {
		return "Clan [name=" + name + ", firstPersonage=" + firstPersonage + "]";
	}

}
