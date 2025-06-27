import { Link } from "react-router-dom";


const Header = () => {
    return (
        <header style={{
            padding: '10px',
            backgroundColor: '#282c34',
            color: 'white',
            display: 'flex',
            justifyContent: 'space-between',
            alignItems: 'center'
        }}>
            <h2>EStore Products Store</h2>
            <br />
            
            <nav>
                <Link to="/" style={{ color: 'white', marginRight: '15px', textDecoration: 'none' }}>
                    Product List
                </Link>

                <Link to="/add-product" style={{ color: 'white', textDecoration: 'none' }}>
                    Add Product
                </Link>
            </nav>

        </header>
    );
}

export default Header;