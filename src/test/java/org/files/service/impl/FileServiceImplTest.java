package org.files.service.impl;

import org.files.service.FileService;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FileServiceImplTest {

    private static final ClassPathResource IMAGE_RESOURCE = new ClassPathResource("files/image.jpg");
    private final FileService fileService = new FileServiceImpl();

    @Test
    public void getDigest() throws Exception {
        String expectedDigest = "195c064cb99fd2cae41e16feaec3393733d742ee80a0ae43ee1ec91e9aae21dae4d5db1d6a7a3c0a54f05a78699a402bc612e0694925ed316610ed85a6c57dc4";
        assertThat(fileService.getDigest(IMAGE_RESOURCE.getFile()), is(expectedDigest));
    }

    @Test
    public void getExtension() throws Exception {
        assertThat(fileService.getExtension(IMAGE_RESOURCE.getFilename()), is("jpg"));
    }

    @Test
    public void getName() throws Exception {
        assertThat(fileService.getBaseName(IMAGE_RESOURCE.getFilename()), is("image"));
    }

    @Test
    public void sizes() throws Exception {
        assertThat(fileService.sizes(IMAGE_RESOURCE.getFile()), is(212755L));
    }

}