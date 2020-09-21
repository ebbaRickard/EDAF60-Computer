package words;

public abstract class Word {
	
	public abstract void add(Word word);
	
	public abstract void mul(Word word);
	
	public abstract void write(Word word);
	
	public abstract boolean equals(Word word);
	
	public abstract Word getWord();
	
	public abstract String toString();
	
	
}