import { versionOptions } from "../config/globals/index.js"

function setVersionFirstValue(currentModel){
  const { value: versionValue } = versionOptions
    .find(version => version.getAttribute('data-model') === currentModel)

  versionContainer.value = versionValue
}

export function changeModelHandler(event, selectedModel){
  const { value = selectedModel } = event?.target ?? {}

  versionOptions.forEach( version => {
    const isModelSelected = version.getAttribute('data-model') === value

    if(!isModelSelected)
      return version.classList.add("hidden")
    
    version.classList.remove("hidden")
  })

  setVersionFirstValue(value)
}
