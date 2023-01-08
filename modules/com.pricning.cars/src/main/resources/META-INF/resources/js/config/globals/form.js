import { formElementsIds } from "../constants/index.js"

export const versionContainer = document.querySelector(formElementsIds.VERSIONS)

export const versionOptions = Array.from(versionContainer.querySelectorAll("option"))

export const modelsContainer = document.querySelector(formElementsIds.MODELS)
