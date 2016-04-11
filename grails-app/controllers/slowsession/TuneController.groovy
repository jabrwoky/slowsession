package slowsession

import grails.converters.JSON

class TuneController {

    static defaultAction = "home"
    def home() {
        render "<h1>Slow Session Tunes</h1>"
    }

    def list() {
        ["tuneTitle":"joes","tuneType":TuneType.reel]
    }
}
