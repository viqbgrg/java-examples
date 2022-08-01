package com.github.viqbgrg.javademo.bytes;

import org.junit.jupiter.api.Test;

public class BytesTest {

    @Test
    void bytesTest() {
        String a = "東邪西毒 (1994) [tmdbid=40751] - Top108.东邪西毒终极版.Ashes.of.Tim. Redux.2008.JPN.Bluray.1080p.x265.AAC(5.1).2Audios.GREENOTEA [tmdbid=40751][Bluray-1080p][bit][x265].Chinese(pAG1eD7Zy).ass";
        System.out.println(a.getBytes().length);
    }
}
