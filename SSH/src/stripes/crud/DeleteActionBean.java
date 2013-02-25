package stripes.crud;

import java.sql.SQLException;
import java.util.List;

import logic.Student;

import DAO.Factory;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.util.UrlBuilder;
import org.hibernate.search.annotations.Resolution;

/**
 * Created with IntelliJ IDEA.
 * User: Technodrive
 * Date: 19.02.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public class DeleteActionBean implements ActionBean {
    ActionBeanContext actionBeanContext;
    private String result;
    private Long Id;
    private String id;

    public void setContext(ActionBeanContext actionBeanContext) {
        this.actionBeanContext=actionBeanContext;
    }


    public ActionBeanContext getContext() {
        return actionBeanContext;

    }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }
    public Long getremove() { return Id; }
    public void setremove(Long Id) { this.Id = Id; }



    @DefaultHandler
    public RedirectResolution
    Delete() throws SQLException{
        Student st=Factory.getInstance().getStudentDAO().getStudentById(this.Id);

        Factory.getInstance().getStudentDAO().deleteStudent(st);

        String str="   ";

        List<Student> studs = Factory.getInstance().getStudentDAO().getAllStudents();



        result=str;

        return new RedirectResolution("/crud/Crud.action");
    }





}
