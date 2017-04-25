package app.hueic.hueicprojectdoanthanhnien.model;

/**
 * Created by Admin on 4/25/2017.
 */

public class UserAvator {
    private int idUserAvator;
    private String fileName;
    private int fileSize;
    private String fileExtension;
    private String fileUrl;
    private int OwnerId;
    private boolean isDelete;

    public int getIdUserAvator() {
        return idUserAvator;
    }

    public void setIdUserAvator(int idUserAvator) {
        this.idUserAvator = idUserAvator;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public int getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(int ownerId) {
        OwnerId = ownerId;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
