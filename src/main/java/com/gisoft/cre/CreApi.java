package com.gisoft.cre;

import java.util.HashMap;
import java.util.Map;

public class CreApi {
    public Map<Integer, CreUserData> getCREinfo(){
        return new HashMap<>(){{
            put(0, new CreUserData("ale", "5ta Avenida", 100));
            put(1, new CreUserData("paty", "4ta Avenida", 50));
        }};
    }
}