Example adding Jacoco plugin to maven project  :

```xml
             <plugin>
                 <groupId>org.jacoco</groupId>
                 <artifactId>jacoco-maven-plugin</artifactId>
                 <version>${jacoco.version}</version>
                 <executions>
                     <execution>
                         <id>prepare-agent</id>
                         <goals>
                             <goal>prepare-agent</goal>
                         </goals>
                     </execution>
                     <execution>
                         <id>report</id>
                         <phase>prepare-package</phase>
                         <goals>
                             <goal>report</goal>
                         </goals>
                     </execution>
                     <execution>
                         <id>post-unit-test</id>
                         <phase>test</phase>
                         <goals>
                             <goal>report</goal>
                         </goals>
                         <configuration>
                             <dataFile>target/jacoco.exec</dataFile>
                             <outputDirectory>target/jacoco-ut</outputDirectory>
                         </configuration>
                     </execution>
                 </executions>
             </plugin>
```
###### run: mvn test
files will store under
targer/jacoco-ut -> index.html  