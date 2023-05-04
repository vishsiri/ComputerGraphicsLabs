//Fragment Shader
#version 330

in vec4 vCol;
in vec2 TexCoord;
out vec4 colour;
in vec3 Normal;

in vec3 FragPos;
uniform vec3 lightPos;

uniform sampler2D texture2D;
uniform vec3 lightColour;
uniform vec3 viewPos;

vec3 ambientLight(){
    float ambientStrength = 0.3f;
    vec3 ambient = ambientStrength * lightColour;
    return ambient;
}

vec3 diffuseLight(){
    //lamberd's law ? maybe
    float diffuseStrength = 0.5f;
    vec3 norm = normalize(Normal);
    vec3 lightDir = normalize(lightPos - FragPos);

    float diff = max(dot(norm, lightDir), 0);
    vec3 diffuse = diffuseStrength * lightColour * diff;
    return diffuse;

}

vec3 specularLight()
{
    float specularStrength = 0.8f;
    float shininess = 24.0f;
    vec3 lightDir = normalize(lightPos - FragPos);
    vec3 norm = normalize(Normal);
    vec3 reflectDir = reflect(-lightDir, norm);
    vec3 viewDir = normalize(viewPos - FragPos);

    //phong
    float spec = pow(max(dot(viewDir, reflectDir), 1.0f), shininess);

    //blinn-phong
    // vec3 halfDir = (lightDir+viewDir) / 2.0f;
    // float spec = pow(max(dot(halfDir, norm), 0.0f), shininess);

    vec3 specular = specularStrength * lightColour * spec;
    return specular;
}
void main()
{
    //colour = vCol;
    colour = texture(texture2D, TexCoord) * vec4(ambientLight()+diffuseLight()+specularLight(), 1.0f);
}