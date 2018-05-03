package org.files.service.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.files.model.Node;
import org.files.model.structure.Resource;
import org.files.service.FileService;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.List;

@Component
public class FileServiceImpl implements FileService {

    public String getDigest(File file) throws IOException {
        return new DigestUtils(MessageDigestAlgorithms.SHA_512).digestAsHex(file);
    }

    @Override
    public String getExtension(String filename) {
        return FilenameUtils.getExtension(filename);
    }

    @Override
    public String getBaseName(String filename) {
        return FilenameUtils.getBaseName(filename);
    }

    @Override
    public long sizes(File file) {
        return FileUtils.sizeOf(file);
    }

    @Override
    public Collection<File> read(String resourcePath) {
        return FileUtils.listFilesAndDirs(new File(resourcePath), TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
    }
}
