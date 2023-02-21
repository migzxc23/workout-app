package com.example.sevenminuteworkout

class ExerciseModel(
    /*
        Make the variables private but access it in public using getters and setters
     */

    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isCompleted: Boolean,
    private var isSelected: Boolean,
    private var command: String
    ) {
    fun getId() : Int {
        return id
    }

    fun setId(id: Int){
        this.id = id
    }

    fun getName() : String{
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getImage() : Int {
        return image
    }

    fun setImage(image: Int){
        this.image = image
    }

    fun getIsCompleted() : Boolean {
        return isCompleted
    }

    fun setIsCompleted(isCompleted: Boolean){
        this.isCompleted = isCompleted
    }

    fun getIsSelected() : Boolean{
        return isSelected
    }

    fun setIsSelected(isSelected: Boolean){
        this.isSelected = isSelected
    }

    fun getCommand() : String{
        return command
    }

    fun setCommand(name: String) {
        this.command = command
    }

}