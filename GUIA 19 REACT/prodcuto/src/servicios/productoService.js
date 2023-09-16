export async function obtenerProductos() {
    const response = await fetch('https://fakestoreapi.com/products');
    const data = await response.json();
    return data;
}

export async function obtenerProductoPorId(id) {
    const response = await fetch('https://fakestoreapi.com/products/4');
    const data = await response.json();
    return data;
}