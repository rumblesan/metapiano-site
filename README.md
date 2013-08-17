# Meta Piano project site

This is the web facing site for the Meta Piano project. It will display information about the project, provide a link to the audio stream, and allow people to upload poems.

## Developing

If you want to develop the site, these instructions should help.

These instructions will hopefully not be very command line heavy.

### Windows

Make sure you have [Java](http://java.com/en/download/index.jsp) and [SBT](http://scalasbt.artifactoryonline.com/scalasbt/sbt-native-packages/org/scala-sbt/sbt//0.12.2/sbt.msi) installed.

It would also be a good idea to get the [Github for Windows](http://windows.github.com/) app which should make git easier to use.

Using the Github app, clone this repository into a folder on your local machine. Open that folder and double click the winrun.bat file. Hopefully there are no errors.

Open up a browser and go to [http://localhost:9000](http://localhost:9000), you should see the site as it is at the moment.

To modify the HTML, look in the app/views folder to see the existing pages. If more pages are needed then it's probably easiest to let me know and I'll add them.

The CSS and Javascript files are in public/css and public/js.

The current layout is done using [Twitter Bootstrap](http://getbootstrap.com/). For the column/row layout docs, [look here](http://getbootstrap.com/css/#grid).

