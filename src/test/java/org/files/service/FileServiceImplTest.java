package org.files.service;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FileServiceImplTest {
    private FileService fileService = new FileServiceImpl();

    @Test
    public void getDigest() throws Exception {
        String expectedDigest = "195c064cb99fd2cae41e16feaec3393733d742ee80a0ae43ee1ec91e9aae21dae4d5db1d6a7a3c0a54f05a78699a402bc612e0694925ed316610ed85a6c57dc4";
        String absolutePath = new ClassPathResource("static/image.jpg").getFile().getAbsolutePath();
        assertThat(fileService.getDigest(absolutePath), is(expectedDigest));
    }
}