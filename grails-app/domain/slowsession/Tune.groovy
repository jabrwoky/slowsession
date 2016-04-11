package slowsession

class Tune {
    String tuneTitle
    TuneType tuneType
    static constraints = {
        tuneTitle blank: false
        tuneType blank: false
    }
}
