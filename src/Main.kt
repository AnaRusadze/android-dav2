fun main(){

    val point1 = Point(3F, 4.1F)
    val point2 = Point(7.8F, 6F)

    println(point1 == point2)

    point1.getXCoordSymmetry()
}

class Point(private var xCoord: Float, private var yCoord: Float){


    override fun equals(other: Any?): Boolean {
        if(other is Point){
            if(this.xCoord == other.xCoord && this.yCoord ==other.yCoord) return true
        }
        return false
    }

    override fun toString(): String {
        return "$xCoord ; $yCoord"
    }

    fun getXCoordSymmetry(): String {
        this.yCoord = -1 * this.yCoord
        return this.toString()
    }

}

