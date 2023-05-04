package com.github.viqbgrg.javademo.paths;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest {

    @Test
    public void test() {
        String url = "欧美剧/The Dark Crystal: Age of Resistance (2019)/Season 01/The Dark Crystal Age of Resistance (2019) S01E01 [NF WEBRip-1080p][8bit][h264][AAC 2.0]-VINEnc.mp4";
        String[] split = url.split("/");
        Path path = Paths.get("e:/meida", split);
        System.out.println(path.toString());
    }
}
