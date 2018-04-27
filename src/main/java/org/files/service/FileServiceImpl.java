package org.files.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class FileServiceImpl implements FileService {

    public String getDigest(String filePath) throws IOException {
        return new DigestUtils(MessageDigestAlgorithms.SHA_512).digestAsHex(new File(filePath));
    }
}
