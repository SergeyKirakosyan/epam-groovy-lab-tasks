/**
Parse input json, find all entries, and return another json with values where
sum of digits in value field equal to 9.
Example:
Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}") == "{\"Kate\":18,\"Osvald\":27}"`
*/

package groovylab
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class Task08 {
    public static String parseAndFilterJson(String input) {
        def my_slurper = new JsonSlurper()
        def my_input = my_slurper.parseText(input)
            return JsonOutput.toJson(my_input.findAll {it.value % 9 == 0})
    }
}
