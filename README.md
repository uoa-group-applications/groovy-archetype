groovy-archetype
================

This creates LMZ groovy archetypes.

After creating, you must go into the POM and change the

     <default.repo>UoA.ITSS.GrpApps/CHANGEME</default.repo>

To point to your own location in the Subversion repository.

You may also want go into src/test/resources/war.properties and change the default localized properties
to use your main project's properties.

    scanner.commonConfigFiles=$home/my-artifact.properties

Usage:

    mvn archetype:generate -DarchetypeGroupId=nz.ac.auckland.lmz -DarchetypeArtifactId=groovy-archetype -DarchetypeVersion=1.1 -DgroupId=nz.ac.auckland.test -DartifactId=my-artifact
