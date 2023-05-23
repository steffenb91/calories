package com.steffenboe.codingchallenges;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Expedition {

    private List<Elf> elves = new ArrayList<>();
    private Elf currentElf;

    public void addElf(Elf elf) {
        this.elves.add(elf);
        this.currentElf = elf;
    }

    public void addCalories(int calories) {
        currentElf.addCalories(calories);
    }

	public List<Elf> getElves() {
		return new ArrayList<>(elves);
	}

}
