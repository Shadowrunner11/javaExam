import { changeModelHandler } from "./controller/form.js"
import { preventDefaultHOF } from "./utils/index.js"

changeModelHandler(null, modelsContainer.value)

$("#models")
  .on("change",preventDefaultHOF(changeModelHandler))
