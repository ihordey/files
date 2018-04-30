package org.files.service.impl;

import org.files.model.Check;
import org.files.service.CheckService;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckServiceImplTest {
    private static final ClassPathResource IMAGE_RESOURCE = new ClassPathResource("files/image.jpg");
    private final CheckService checkService = new CheckServiceImpl();

    @Test

    public void check() throws Exception {
        String expectedDigest = "195c064cb99fd2cae41e16feaec3393733d742ee80a0ae43ee1ec91e9aae21dae4d5db1d6a7a3c0a54f05a78699a402bc612e0694925ed316610ed85a6c57dc4";
        assertThat(checkService.check(IMAGE_RESOURCE.getPath()),
                is(new Check("image", "jpg", 212755L, expectedDigest)));
    }

}