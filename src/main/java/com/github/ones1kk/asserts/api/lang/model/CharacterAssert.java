package com.github.ones1kk.asserts.api.lang.model;

import com.github.ones1kk.asserts.api.lang.character.AbstractCharacterAssert;

public class CharacterAssert extends AbstractCharacterAssert<CharacterAssert, Character> {

    public CharacterAssert(Character character) {
        super(CharacterAssert.class, character);
    }
}
