public void Save(String data, String filePath) {
    // Check if the data or file path is null
    if (data == null || filePath == null) {
        throw new IllegalArgumentException("Data or file path cannot be null.");
    }
    
    try (FileWriter writer = new FileWriter(filePath, true)) {
        // Write the data to the file
        writer.write(data);
        writer.flush();
    } catch (IOException e) {
        // Handle potential IO exceptions
        e.printStackTrace();
    }
}
