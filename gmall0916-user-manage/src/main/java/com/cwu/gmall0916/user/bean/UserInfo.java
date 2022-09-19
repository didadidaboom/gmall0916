package com.cwu.gmall0916.user.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserInfo implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;
    @Column
    public String login_name;
    @Column
    public String nick_name;
    @Column
    public String passwd;
    @Column
    public String name;
    @Column
    public String phone_num;
    @Column
    public String email;
    @Column
    public String head_img;
    @Column
    public String user_level;

}
