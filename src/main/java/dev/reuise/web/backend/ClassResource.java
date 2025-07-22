package dev.reuise.web.backend;

public class ClassResource {
    private final String path;
    private final Class<?> clazz;

    public ClassResource(String path) {
        this(path, (Class<?>) null);
    }

    public ClassResource(String path, Class<?> clazz) {
        this.path = path;
        this.clazz = clazz;
    }

    public String getPath() {
        return path;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}
