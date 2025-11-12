package com.profiles.nexuprysm.file.hash;

import com.profiles.nexuprysm.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
