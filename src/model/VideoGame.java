package model;

import java.util.*;

public class VideoGame {

	private ArrayList<Clan> clans;

	public VideoGame() {
		ArrayList<Clan> clans = new ArrayList<Clan>();

	}

	public ArrayList<Clan> getClans() {
		return clans;
	}

	public void setClans(ArrayList<Clan> clans) {
		this.clans = clans;
	}

	@Override
	public String toString() {
		return "VideoGame [clans=" + clans + "]";
	}

	// By Insertion
	public void sortClanByName() {
		for (int i = 1; i < clans.size(); i++) {
			for (int i2 = i; i2 > 0 && clans.get(i2 - 1).compareByName(clans.get(i2)) > 0; i2--) {
				Clan temp = clans.get(i2);
				clans.set(i2, clans.get(i2 - 1));
				clans.set(i2 - 1, temp);
			}
		}

	}

}
