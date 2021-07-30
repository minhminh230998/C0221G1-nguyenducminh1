package model.bean.customerService;

public class AttachServiceContract {
    private String idContract;
    private String nameAttachService;
    private String idAttachService;

    public AttachServiceContract() {
    }

    public AttachServiceContract(String idContract, String nameAttachService, String idAttachService) {
        this.idContract = idContract;
        this.nameAttachService = nameAttachService;
        this.idAttachService = idAttachService;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getNameAttachService() {
        return nameAttachService;
    }

    public void setNameAttachService(String nameAttachService) {
        this.nameAttachService = nameAttachService;
    }

    public String getIdAttachService() {
        return idAttachService;
    }

    public void setIdAttachService(String idAttachService) {
        this.idAttachService = idAttachService;
    }
}
