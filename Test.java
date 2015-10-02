

public class Test {
	private String name;
	private int testId;
	private int score;
	
	Test(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Test name: " + name + "\n" + "Test ID: " + testId
				+ "\n" + "Score: " + score;
	}

}
