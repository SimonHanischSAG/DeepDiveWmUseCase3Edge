

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class DeepDiveWmUseCase3Edge

{
	// ---( internal utility methods )---

	final static DeepDiveWmUseCase3Edge _instance = new DeepDiveWmUseCase3Edge();

	static DeepDiveWmUseCase3Edge _newInstance() { return new DeepDiveWmUseCase3Edge(); }

	static DeepDiveWmUseCase3Edge _cast(Object o) { return (DeepDiveWmUseCase3Edge)o; }

	// ---( server methods )---




	public static final void throwError (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(throwError)>> ---
		// @sigtype java 3.5
		// [i] field:0:required message
		IDataMap pipeMap = new IDataMap(pipeline);
		
		throw new ServiceException(pipeMap.getAsString("message"));
		// --- <<IS-END>> ---

                
	}
}

