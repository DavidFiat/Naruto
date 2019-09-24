package model;
import java.util.*;

public class Personage implements Comparator<Personage>{

	private double score;
	private String name;
	private String personality;
	private Date date;
	private double power;
	private Technique firstTechnique;
	private Personage next;
	private Personage previous;
	


	public Personage(String name, String personality, Date date, double power) {
		//Metodo score;
		this.name = name;
		this.personality = personality;
		this.date = date;
		this.power = power;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	public Technique getFirstTechnique() {
		return firstTechnique;
	}

	public void setFirstTechnique(Technique firstTechnique) {
		this.firstTechnique = firstTechnique;
	}

	public Personage getNext() {
		return next;
	}

	

	public void setNext(Personage next) {
		this.next = next;
	}

	public Personage getPrevious() {
		return previous;
	}

	public void setPrevious(Personage previous) {
		this.previous = previous;
	}
	
	// By Selection
	public void sortTechniquesByName() {
		
		}
	
	
	
	
	
	@Override
	public String toString() {
		return "Personage [score=" + score + ", name=" + name + ", personality=" + personality + ", date=" + date
				+ ", power=" + power + ", firstTechnique=" + firstTechnique + ", next=" + next + ", previous="
				+ previous + "]";
	}
	@Override
	public int compare(Personage a, Personage b) {
		return (int) ((a.getScore())-(b.getScore()));
	}

}
