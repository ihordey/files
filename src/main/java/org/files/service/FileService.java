package org.files.service;

import java.io.IOException;

public interface FileService {
    String getDigest(String filePath) throws IOException;
}
