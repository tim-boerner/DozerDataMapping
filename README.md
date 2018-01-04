# DozerDataMapping
Example Application to show, how to use Dozer to map data to JAXB generated java objects

The java sources will be generated with the `mvn clean install` command.

After that you can run the TestingApp.java class wich will convert a java object to MODS and EAD format and prints it out.
Up to now, I was not able to map directly to generated target format sources because of the often used generic collections. A workaround for this so far was, to map to a DTO object and fill the generated sources with own code.

Main goal was that the mapping in configured in xml and can bee changed during runtime.
