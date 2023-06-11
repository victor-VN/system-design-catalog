
### add new entry
```
ldapadd -H ldap://localhost -x -D "cn=admin,dc=collegefloral,dc=org" -f /tmp/createdit.ldif -w admin
```

### edit entry
```
ldapadd -H ldap://localhost -x -D "cn=admin,dc=collegefloral,dc=org" -f /tmp/modyentry.ldif -w admin
```

### create groups and attach people to it 
```
ldapadd -H ldap://localhost -x -D "cn=admin,dc=collegefloral,dc=org" -f /tmp/creategroups.ldif -w admin
```

### modify acl entry on databse
```
ldapmodify -Y EXTERNAL -H ldapi:/// -f /tmp/acl.ldif
```

Both commands was executed inside ldap docker container and need the files to be imported inside container /tmp folder


### read acls
```
ldapsearch -H ldapi:/// -Y EXTERNAL -LLL -Q -b 'olcDatabase={1}mdb,cn=config'  -s base olcAccess
```