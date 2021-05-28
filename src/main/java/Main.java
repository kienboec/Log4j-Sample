public class Main {

    // development since 1996.
	//
	// This popular and proven architecture has so far been ported to 12 languages (see http://logging.apache.org/ ).

	// Features ( http://logging.apache.org/log4net/release/features.html ):
	// - Output to multiple logging targets (see: Out of the box Appenders
	// - Hierarchical logging architecture
	// - Dynamic XML Configuration
	// - Logging Context (e.g.: Thread Context)
	// - Proven architecture
	// - Modular and extensible design
	// - High performance with flexibility

	// Components:
	// - loggers (hierarchical - like namespaces; split with dots / root (default: debug) always exists / child inherits from parent),
	// - appenders and
	// - layouts 
	//
	// with filters (should I print this message?) and
	// objects renderer (object -> string)

	// LOG LEVEL
	// - ALL ( TRACE )
	// - DEBUG
	// - INFO
	// - WARN
	// - ERROR
	// - FATAL
	// - OFF

    public static void main(String[] args){
        Executor sample =
                // new Sample1();
                // new Sample2();
                new Sample3();

        sample.execute();
    }
}
