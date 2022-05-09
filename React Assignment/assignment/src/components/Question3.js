import React, { useState } from "react";
import { nanoid } from "nanoid";
import data from "./data.json";
import "./Question3.css";


const Question3 = () => {
  const [contacts, setContacts] = useState(data);
  const [addFormData, setAddFormData] = useState({
    Name: "",
    Job: "",
  });

  const handleAddFormChange = (event) => {
    event.preventDefault();

    const fieldName = event.target.getAttribute("name");
    const fieldValue = event.target.value;

    const newFormData = { ...addFormData };
    newFormData[fieldName] = fieldValue;

    setAddFormData(newFormData);
  };

  const handleAddFormSubmit = (event) => {
    event.preventDefault();

    const newContact = {
      id: nanoid(),
      Name: addFormData.Name,
      address: addFormData.address,
      phoneNumber: addFormData.phoneNumber,
      email: addFormData.email,
      Job: addFormData.Job,
    };
    
    const newContacts = [...contacts, newContact];
    setContacts(newContacts);
  };

  const handleDeleteClick = (contactId) => {
    const newContacts = [...contacts];

    const index = contacts.findIndex((contact) => contact.id === contactId);

    newContacts.splice(index, 1);

    setContacts(newContacts);
  };

  return (
    <div className="app-container">
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Job</th>
            <th>Remove</th>
          </tr>
        </thead>
        <tbody>
          {contacts.map((contact) => (
            <tr>
              <td>{contact.Name}</td>
              <td>{contact.Job}</td>
              <td>
                <button
                  type="button"
                  className="btn btn-primary"
                  onClick={() => handleDeleteClick(contact.id)}
                >
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      <br />
      <h1>Add New Employee</h1>
      <br />

      <form onSubmit={handleAddFormSubmit}>
        <label>
          <b>Name</b>
        </label>
        <input
          type="text"
          name="Name"
          className="form-control"
          placeholder="enter the name"
          onChange={handleAddFormChange}
        />

        <label>
          <b>Job</b>
        </label>
        <input
          type="text"
          name="Job"
          className="form-control"
          placeholder="enter the job"
          onChange={handleAddFormChange}
        />
        <br />
        <button type="submit" className="btn btn-primary">
          SUBMIT
        </button>
      </form>
    </div>
  );
};
export default Question3;

// import React, { Component } from "react";

// class Question3 extends Component {
//   constructor(props) {
//     super(props);

//     this.state = {
//       Name: "",
//       Job: "",
//     };
//   }

//   handleSubmit = (event) => {
//     alert(`${this.state.Name} ${this.state.Job} `);
//   };

//   handleName = (event) => {
//     this.setState({
//       Name: event.target.value,
//     });
//   };

//   handleJob = (event) => {
//     this.setState({
//       Job: event.target.value,
//     });
//   };

//   render() {
//     return (
//       <div>
//         <table onSubmit={this.handleSubmit} className="table">
//           <thead>
//             <tr>
//               <th scope="col">Name</th>
//               <th scope="col">Job</th>
//               <th scope="col">Remove</th>
//             </tr>
//           </thead>
//         </table>
//         <br />
//         <div>
//           <h1>Add New Employee</h1>
//           <br />
//         </div>

//         <div className="mb-3">
//           <label>
//             <b style={{}}>Name</b>
//           </label>
//           <input
//             type="text"
//             value={this.Name}
//             onChange={this.handleName}
//             className="form-control"
//             placeholder="enter the name"
//           />

//           <label className="form-label">
//             <b>Job</b></label>
//           <input
//             type="text"
//             value={this.Job}
//             onChange={this.handleJob}
//             className="form-control"
//             placeholder="enter the job"
//           />
//           <button type="submit" value="submit" className="btn btn-primary">
//           SUBMIT
//         </button>
//         </div>

//       </div>
//     );
//   }
// }

//export default Question3
