package mybatis.entity;

import javax.persistence.*;

@Table(name = "sys_privilege")
public class SysPrivilege {
    /**
     * 权限ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "privilege_name")
    private String privilegeName;

    /**
     * 权限URL
     */
    @Column(name = "privilege_url")
    private String privilegeUrl;

    /**
     * 获取权限ID
     *
     * @return id - 权限ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置权限ID
     *
     * @param id 权限ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取权限名称
     *
     * @return privilege_name - 权限名称
     */
    public String getPrivilegeName() {
        return privilegeName;
    }

    /**
     * 设置权限名称
     *
     * @param privilegeName 权限名称
     */
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    /**
     * 获取权限URL
     *
     * @return privilege_url - 权限URL
     */
    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    /**
     * 设置权限URL
     *
     * @param privilegeUrl 权限URL
     */
    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}