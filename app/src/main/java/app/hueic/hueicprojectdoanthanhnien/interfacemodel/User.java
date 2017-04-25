package app.hueic.hueicprojectdoanthanhnien.interfacemodel;

import app.hueic.hueicprojectdoanthanhnien.model.Role;
import app.hueic.hueicprojectdoanthanhnien.model.Subrole;
import app.hueic.hueicprojectdoanthanhnien.model.UserAvator;

/**
 * Created by kenhoang on 4/24/17.
 */

public interface User {
    public String username = null;
    public String Password = null;
    public int idUser = 0;
    public boolean isBanner = false;
    public boolean isDelete = false;
    public int userAvatorID = 0;

}
