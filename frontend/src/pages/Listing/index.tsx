import MovieCard from "components/MovieCard";
// import MovieScore from "components/MovieScore";
import Pagination from "components/Pagination";

function Listing() {

    return (
        <>
            <Pagination />
            {/* Using Bootstrap's breakpoints and classes container, row, col 
                col-sm-6 represents, by example, if sm < 576px the container will ocupy 6 
                of 12 Boostrap's total columns
                mb-3 : margin botton = 3*/
            }
            <div className="container">
                <div className="row">
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
                        <MovieCard />
                    </div>
                    <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
                        <MovieCard />
                    </div>
                    
                   
                    
                </div>

            </div>

        </>
    )
}

export default Listing;